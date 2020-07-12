import java.sql.Time;

import jdk.internal.platform.cgroupv1.SubSystem;

public class CriandoProcesso {
    public static void main(String args[]) {
        try{
            ProcessBuilder pb = new ProcessBuilder("nautilus");
            pb.start();
        }catch(Exception e){
            System.out.println();
        }
    }
    
}