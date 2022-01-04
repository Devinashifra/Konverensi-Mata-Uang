package konversi.konversi.mata.uang;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import konversi.konversi.mata.uang.logicalProcess;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */

@Controller
@ResponseBody
public class projectController {
    
    
    @RequestMapping("/tampilkanhasildolar")
    public String tampilkanhasildolar() {
        
        int hasil = logic.getDolar();
        
        int dolar = 1; //kurs yang dicek
        int rupiah = 14500; //kurs sekarang
        
        String view = "Hasil Konversi idr to dolar = " + hasil;
                
        return view;
    }
    
    logicalProcess logic = new logicalProcess();
    
    @RequestMapping("tampilkanhasilyen")
    public String tampilkanhasilyen() {
        
        int hasil = logic.getYen();
            
        int yen = 1; //kurs yang dicek
        int rupiah = 127; //kurs sekarang
        
        String view = "Hasil Konversi idr to yen = " + hasil;
                
        return view; 
    }
    
    @RequestMapping("tampilkanhasilwon")
    public String tampilkanhasilwon() {
        
        int hasil = logic.getWon();
            
        int won = 1000; //kurs yang dicek
        int rupiah = 12000; //kurs sekarang
        
        String view = "Hasil Konversi idr to won = " + hasil;
                
        return view; 
    }
    
    @RequestMapping("tampilkanhasilbaht")
    public String tampilkanhasilbaht() {
        
        int hasil = logic.getBaht();
            
        int baht = 100; //kurs yang dicek
        int rupiah = 43000; //kurs sekarang
        
        String view = "Hasil Konversi idr to baht = " + hasil;
                
        return view; 
    }
}
