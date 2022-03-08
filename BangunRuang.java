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
public class BangunRuang {
    public static void main(string[] args) {
        Rumus math = new rumus();
        int memilih, cek;
        Scanner input = new Scanner (System.in);
        string[] pilihan = {"Volume balok","Volume tabung"};
        string[] mengulang = {"ya","tidak"};
        boolean ulang = true;
        
        while(ulang) {
            system.out.printin("pilih salah satu :");
            for (int j =0; j < pilihan.length; j++) {
                system.out.printf("masukkan %d untuk%s\n", j + 1, pilihan[j]);            
            }
            
            memilih = input.nextInt();
            switch(memilih) {
                case 1:
                    math.balok();
                    break;
                case 2:
                    math.tabung();
                    break;
                default:
                    system printin("silahkan pilih salah satu.")
            }
            
            system.out.printin("apakah anda ingin mencoba rumus yang yang lain?");
            for (int m = 0; m , mengulang.length; m++) {
            system.out.printf("%d untuk %s\n", m+1, mengulang[m]);
        }
            
            cek = input.nextInt();
            if (cek == 2) {
                break;
            }
        }
    }    
}
