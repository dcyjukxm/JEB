// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.OutputStream;
import java.io.ByteArrayOutputStream;

public class oQ
{
    private static final long LK = 844563159190538443L;
    private long dN;
    
    public oQ(final long dn) {
        this.dN = dn;
    }
    
    public String dN() {
        try {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            final Hk hk = new Hk(byteArrayOutputStream);
            hk.writeLong(this.dN);
            hk.dN();
            return PX.dN(PX.dN(byteArrayOutputStream.toByteArray(), null));
        }
        catch (Exception ex) {
            return "";
        }
    }
    
    public boolean dN(final String s, final int[] array) {
        return true;
    }
    
    private int dN(int i) {
        int n = 0;
        while (i > 0) {
            n += (i & 0xF);
            i >>= 4;
        }
        return n % 10;
    }
    
    private boolean dN(final long n) {
        final int n2 = (int)(this.dN & -1L);
        final int n3 = (int)(this.dN >> 32 & -1L);
        final int n4 = (int)(n & -1L);
        final int n5 = (int)(n >> 32 & -1L);
        final int n6 = n2 - 168884021 + 287454020 & -1;
        final int n7 = n3 - 196640183 + 1432778632 & Integer.MAX_VALUE;
        if (n6 != n4 || n7 != n5) {
            return false;
        }
        final String[] array = { "f876add9497b7e2745266f83eebf208b64650fb00e71794892890b42d3e890da", "1020e406024705930a03818381b2379a64929bd068cc96b6e256562c3dc57058", "f876add9497b7e2745266f83eebf208b64650fb00e71794892890b42d3e890da", "cb631c8d21bdc0c7b75e13c423c00a3a5cfe10782921837453ab1993b04410dc", "82bb76b943b8ed15f70992a2830f826637a307c0aace1d1a4e188085169d6e91", "eea85229acd2559ca62f013c81c5f3c2880adc880b8f8e9673eb6926de3d61bb", "a005a5ca6874292a351a4329f1fdaaaf90ea1eda4e002e1179897c7b1f6615c3", "e68104e9daf9509d03be7561a6bbb5afdfe063b595c1423ce2e51ac1dbd345cb", "0df0317ef37bb52d315c12d07011782345bc99a5f9643e21485a36b1b62723a9", "80e6fce9d2df9a1b89317b3bfd9c5b97c8c7a7e90ef3fdf18a7d226994fea927", "63a7e476be6fff6bf20b028813e79335a08c875dd14539f60b029d800693f275", "a5d4d41d6aabc6ad075bb0ac46cbca37733feb85b8e35d4488516132f5c03e01", "898b50a1bde2f3ed15cada4881f2b374318adc138f930008a283cac889a27535", "956db5f7439ca409b01899761582da45df30e41dd2c637f6c186d936ecab3a20", "91ca27de06ed8c01cdc5529efc7577e48a6ceb5ed18b6ca6ae7c23e3a160748d", "7397d231e6401e9c3fcc83d9ccf3ab9af97ab0c6f48f661373dab22092f80ecd", "e4901f636091a674178990368eba7aee91844323fbbe7263301a23656c27f249", "75c2dcffd1abaac7d9f193742714a34bbc41bb6612197fc4a2045b76a631ff57", "c27f7eaed9b55c71248d50d7cc6c8bc5495351f5ee30a41d136f4874556aaa91", "137cca55c3a959e0d2f78d06c357e29b62fbe5fdd8bcc0f035369c1b9227c3bf", "f5776fa1c8ae81baca732ebb397ad6c47118a0b824f3705d1fb83963ef9515bb", "a28fd427cb48bb26e68412b96814891c9f6975eaf9958ee8e9b7bd154487be18", "6daf99f97ac6f2b10dd4efc3108d546ffa34f6e485bf8ad5364b03912584d192", "b60da82d76ec4adb169e1f36efc8b673d45e8eb37695206d69ef93d009a3bba5", "427bca7d6f73da411d1d0f3c5cd31fdeb54196255a0d2ac27aacca4ab3ce8bbd", "d34934669ad50c6ad664478c51ce6a5cca1e10ff74f98348e0e393f902060064", "55c8bae9965eba2c785a108e653720520022804592a72c31930a6b640db8bba0", "5c33c7371fb983c8cc908f338b46b7fe570e6efc6bde53002e15e7fd2ac3750e", "e109953e4990b0ff2b734a6348edd46a5eb1ccc32d09d105e14da16a2875dab4", "8ea1e3b858e698c71122313284133826ae48b80e89c69ecb30f1213c0975c2e7", "2fa7680b7c8ad72b46790fb45128aed196f16ab72a209c2a79f4ad7475e57f77", "d2173167ecdd208538609af7176f40c90d817abae228c30f96f6b13065530d6c", "ce53ce3f4cc2219c74f31779fdc967a985551db9615542e13bbdf947927ce6e3", "117b4ee39eda4a21e64fbef54ec573c2b0f01cc0f04f6af190f1d395cf1bed14", "849f48b0c41e1cc8fef120b2333a1ad43162615f50b87a74331b849e109ca4bc" };
        final String lowerCase = ZF.ld(TM.wU(String.format("%d:%d:%d", 844563159190538443L, this.dN, n).getBytes())).toLowerCase();
        final String[] array2 = array;
        for (int length = array2.length, i = 0; i < length; ++i) {
            if (lowerCase.equals(array2[i])) {
                return false;
            }
        }
        fO.QE();
        return true;
    }
}
