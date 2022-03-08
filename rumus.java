/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg2;

/**
 *
 * @author INNOCENTUS
 */
public class rumus {
    Scanner key = new Scanner (System.in);
    int p, l, t, hasil, s;
    double volTabung, r, ti;
    final double phi = 3.14;
    
    void balok() {
        system.out.printin("masukkan panjang :");
        p = key.nextInt();
        system.out.printin("masukkan lebar :");
        l = key.nextInt();
        system.out.printin("masukkan tinggi :");
        t = key.nextInt();
        
        hasil = p * l * t;
        system.out.printin("hasilnya adalah : " + hasil + " cm kubik");
    }
    
    void tabung() {
        system.out.printin("masukkan diameter :");
        r = key.nextDouble();
        system.out.printin("masukkan panjang :");
        ti = key.nextDouble();
        
        volTabung = (phi * (r/2) * (r/2)) * ti;
        system.out.printin ("hasilnnya adalah :" + math.round(volTabung) + " cm kubik");  
    }
}
