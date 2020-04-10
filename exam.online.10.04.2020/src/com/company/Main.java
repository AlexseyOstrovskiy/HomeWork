package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
      /* String x ="NEZE ETTPMGEXMSRW EVI XCTMGEPPC GSQTMPIH XS FCXIGSHI XLEX GER VYR SR ERC NEZE ZMVXYEP QEGLMRI VIKEVHPIWW SJ XLI YRHIVPCMRK GSQTYXIV EVGLMXIGXYVI";
        char[] array = x.toCharArray();
        char[] array2 = new char[array.length];
        for (int i = 0; i < array.length ; i++) {

            array2[i] = ((char) ((int)(array[i])-3));
        }
        System.out.println(array);
        System.out.println(array2);
        System.out.println(array2[0] );
        System.out.println(array2[7] );
        System.out.println(array2[9]);
        System.out.println( array2[10]);
        System.out.println(array2[23]);
/*
        char N = 'N';
        System.out.println((char)((int)N - 3));
       // System.out.println((char)78);
        int k  = 3;

        System.out.println();

 */
      String [][] array = new String[50][50];
      /*
A: (2;20)
C: (3;50)
H: (10;10)
I: (8;40)
M: (1;2)
O: (43;17)
R: (14;18)
S: (20;20)
W: (31;16)
Z: (24;27)
       */
      /*
      array[1][19] = "A";
      array[2][49] = "C";
      array[9][9] = "H";
      array[7][39] = "I";
      array[0][1] = "M";
      array[42][16] = "O";
      array[13][17] = "R";
      array[19][19] = "S";
      array[30][15] = "W";
      array[23][26] = "Z";

      int x = 0;
      int y = 0;
      String player = array[x][y];
     // if (player != null){
       // System.out.println(player);}


      String hod = "RRRRRRRRRBBBBBBBBBBBBBBBBBBBBRRRRRRRRRRUURRRRRRRBBBBBBBBBBBRRURRRRRRRRRRRUUUUUUUUUUUUUUUUUUUUUUUUUURRRRRRRRRRLLLLLLLLLLLBBBBBBBBBBBBBBBBBBBBBLLLLLLLLLLLLLLLUUUULLLLLLUUUUUUUUUUBBBBUUUULLLLLLLLLLLLLLLLUUUUUUUUURRRRR";
      char[] chars = hod.toCharArray();
        for (int i = 0; i < hod.length() ; i++) {
            if(chars[i] == 'R'){
                    y = y +1;
                    player = array[x][y];
                    if (player != null){
                        System.out.println(player);
                   }
            }
           else if(chars[i] == 'L'){
                    y = y -1;
                player = array[x][y];
                    if (player != null){
                        System.out.println(player);
           }
                   }
            else if(chars[i] == 'U') {
                x = x - 1;
                player = array[x][y];
                if (player != null) {
                    System.out.println(player);
                }
            }
            else if(chars[i] == 'B'){
                    x = x + 1;
                player = array[x][y];
                    if (player != null){
                        System.out.println(player);
            }
                   }
            }

       */


      String x = "P`qtd\u001Etdvt\u001F`ekmw\u001Fmn\u001Frhhq rgtd8 grtoq:.-cnbeacatriew.npg.`arc63+tn+il_gd+cnlvdptdp\n" +
              "c_t`8il_gd-pme;a_sd44+gVAMRv.KFeo@?A@LSTfETeA@?G@?A@?uB?Y@?ACVyguk@?AG_EkCQUP4Ws1Yb0gUbQO/6_IAkVj.sJDNrSUjkdFMxC`ZfDKaLC@_WkXGdw8JuUfp2qOck`bTqk0PFN.d5@+UDVgiFF`8ChyW372c+857wSdO.HOe42s781nNMfe6zqXc`UloIWkQZnDyFeBkrme@GfA18rc@IL`-Bj?DnLoBguWpGp?BTEwAveI/BFeAEDt@qXfbAQmAwPZPJF4Fg@XArOUTg9bP8KaD/JZsUynqLFO1Gxx3OL5)vp3UmhJkAqVjpeFZx3cuS2AeoN09iGwLkjQnEq-frUMGBRn.iG7HQibRvYrV+WbMS?ysUbOEq*ubM04Xb/27/dl68ctTtnw3yytJxam/aOEAfscmSPvJxc/rc15Toi2/bu0_V87rOpR36WJ_Pm063/3GAJf3cxXt2`qUEW2dvo.mS37rwPSRp/-k3)NidBx?8/_HCf2h.aMF84EDAu/RoFFh+Odjw2+obeuUxsTz465Qlz47LEj9*NCA0rctT.l5*dz*wpTp1KTrU/uw5dp/o2t36fnup115RhChHP7mjywXQjsXKlX7VqrBK0cuo?UKDjicdPRgyn06/LEhR1WUFfrJ1uwCKRipMFHhPD50bcq2lhFivm7@gDsIB?G5l5*dZQR+.NmSNf.SqUKsY725bRP`G1qrT-4laWi6+OCEuUU5c/Xq4S6z3V5NRg3-Hi@g@CePkcKBw5jXq/5NnnJ1DYU94dny39R6eWMviJt048XcCGp/.p1i0rJJAMxHG)yFBh0I6dlpy?+.hx7-7hCfAn82`54fkIKnS7qlFhvQUU0zYi0`KmPG7c07k)8h/d`nU7dR`Jt25+`SCCn26@gMEzaK8X5d@acHuMVipBQaNlUp61h/agVFw6faAny07Ak1`LGB147XM3`267/uoJv1AHPhTGvdtXuFvNAp7DjPnUtVqGt36twaCXK-/m0qV5etpcyg4lIqU48ddf66mb_OGauoB93I2qHlB2PiPH7aACknv5hOljxv1QC5D5kSjJ1b7RmMmOA@p/Olz0Nful0MsW.cvBD4bItVpQwe8uJyJAwrxKu7jgu5vqUcrG.dPu2NqucfxZn/IygQWcEVhP72AA?8arw3G1Qt3anFmRp0IvNfJRSl0IRICy5CjQm1HfjI4WO?x@.ANBd25ly_uGCjx)3etz.Trk0b62LbDr0)/emRhhnn28dNzFNOmBmDhsdr0xeB3KKEA9RxZ/7WDepu0LBfD@@o4STgUb04Nb0fO78okvl7WvA+edtFVbo.8dfeb@+QiZVTRQSqUNAp5/Wp18Q0`TM*G6cFuRgPFBGBBh7)7IUPDeDP_aB1hmaj0vYTDFCDigS9ECVgenHenFtYrMH.AgBWPWx4jDAO@CDLPW16kMrWp+7ma7UKEXSPiMClzou5P2gFOXJhgV7r/ICAJT7jAD?bCCKh?Js5ctRQVpVpqdJBBv62ghBGo/xFC@?v0AM458LXHi/6YKwcbvKi9FhlPGmIgU`5DJBEjEbERxj?8NpGiPuyRtGP0aPr0w5CNxP.dAUgDwdNSEQChAtb7vm2IQfr6bgRHumETKafw3dT/_NGtcoBQxAGtCWKDtGw5bq9yoPCOnbCsnrwbSEY?F@?hgSDy3cuV6g49dosE)oC4oRR8kXWbeu@1A3FBvdTp/eusHr@YaSwXaIDUxCeHG?SPShcXhJ68AxrjWEC@1qwUvmA8hsXfoSlwhNl3mYbs2yXMsdei2NXN6@mis7iEQEysXu1Lp6aAEFMeRTFvE7+0pJkwzJw0d04F`Djg5guMyKz.x4@tn.-zoKtu?Ud?k8@xxN2Gsii?wHAPAOvJgrhvRSkh0kzYfl6F7bfDUiw.quWJ/lIvIMC0)/bsZNdY1Ty8cpUolJjinb8NVIvSIoszro6VHuHec8s6kaa@TA`5aWWEpGoXieD5gPrKGItUUiK?o/gjljaotXq/1MaXAu/vm7E`CA3BiEvHeBtfw3bDGAwjhBuRTFx3K39l-k6bTguJCeUxCpWNFbMgMuKnoCg_w@flxKlVPE@eCchQHKnU4pTgY*ftvcAviDH4xikrJGD8OWxxejCXf6efhA07+6bm.6pow4L`6cNn6`USxxDjKKJApDOH@qpTq2ocTa5@LBFVrfHZc)+eSvUolVx/DBZh/F@n01`xnXE*qAP@cIxGDwQtcfGmNdhRv7L.tIJPN5_zo29lxZu1sw1Dgu4TAb8UTFRv//ei/s4vR8XxkipJVsA1iN1i2Fe5hw7E7rUO3JR3Klh./q/60dq2JkyczyGqmUUdd336YNh4N`Nl-wXqwhKJwXvdGYHpFFhhsaIvKs8c/YOVEOUm5N`uf7TER?PWjATlgrN9j`YUEKKIYvizpH2@BxLm4KivP)AvFpanC/5GRga7j/dSFduqf_Z4vZucpp-zcvYXF2MgA`jpp`yRtt2wdT4+mcZ173C1wgcvGfBkQtWnqBeIO5/u.pJ?PgVjV112Po@vd5eAc?AJJa@WvD4AiOAhg2fULxMA@0AXesnDq7hQ@Mg1?KJverGU@xAK0b7SLM0fD3E@?A@?EkDTjQuPkCB";
      char[] chars = x.toCharArray();
        for (int i = 0; i <chars.length ; i++) {


        }

        }
    }

