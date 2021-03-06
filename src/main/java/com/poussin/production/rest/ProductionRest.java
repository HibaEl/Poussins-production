package com.poussin.production.rest;

/**
 *
 * @author LENOVO
 */
import com.poussin.production.bean.Production;
import com.poussin.production.rest.converter.AbstractConverter;
import com.poussin.production.rest.converter.ProductionVoConverter;
import com.poussin.production.rest.proxy.EvolutionProxy;
import com.poussin.production.rest.vo.ProductionVo;
import com.poussin.production.rest.vo.RechercheProductionVo;
import com.poussin.production.rest.vo.exchange.EvolutionVo;
import com.poussin.production.service.ProductionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LENOVO
 */
@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping({"/production/productions"})
public class ProductionRest {

    @Autowired
    private ProductionService productionService;

    @Autowired
    @Qualifier("productionVoConverter")
    private AbstractConverter<Production, ProductionVo> productionVoConverter;

    @PostMapping("/recherche")
    public List< ProductionVo> findByRefFirmeAndSemaineProductionAndAnneeProduction(@RequestBody RechercheProductionVo rechercheProductionVo) {
        final List<Production> productions = productionService.findByRefFirmeAndSemaineProductionAndAnneeProduction(rechercheProductionVo.getRefFirme(), new Integer(rechercheProductionVo.getSemaine()), new Integer(rechercheProductionVo.getAnnee()));
        return productionVoConverter.toVo(productions);
    }
@GetMapping("/all")
    public List<ProductionVo> findAll() {
        final List<Production> productions=productionService.findAll();
        return  productionVoConverter.toVo(productions);
    }
    

    @GetMapping("/reference/{reference}")
    public ProductionVo findByReference(@PathVariable String reference) {
        return new ProductionVoConverter().toVo(productionService.findByReference(reference));
    }
@DeleteMapping("/reference/{reference}")
public void deleteByReference(@PathVariable String reference) {
        productionService.deleteByReference(reference);
    }
  

    @PostMapping("/")
    public int createProduction(@RequestBody ProductionVo productionVo) {
        Production production = new ProductionVoConverter().toItem(productionVo);
        return productionService.createProduction(production);
    }

    

    @GetMapping("/semaineProduction/{semaine}/refFirme/{refFirme}/anneeProduction/{annee}")
    public Double averagePoids(@PathVariable Integer semaine, @PathVariable String refFirme, @PathVariable Integer annee) {
        return productionService.averagePoids(semaine, refFirme, annee);
    }

    @GetMapping("/anneeO/{anneeO}/refFirmeO/{refFirmeO}/semaineO/{semaineO}")
    public Double averageNbrOeuf(@PathVariable Integer anneeO, @PathVariable String refFirmeO, @PathVariable Integer semaineO) {
        return productionService.averageNbrOeuf(anneeO, refFirmeO, semaineO);
    }

    public ProductionService getProductionService() {
        return productionService;
    }

    public void setProductionService(ProductionService productionService) {
        this.productionService = productionService;
    }

    public AbstractConverter<Production, ProductionVo> getProductionVoConverter() {
        return productionVoConverter;
    }

    public void setProductionVoConverter(AbstractConverter<Production, ProductionVo> productionVoConverter) {
        this.productionVoConverter = productionVoConverter;
    }

}
