package acilindro;


public class VCilin extends ACili{
    public VCilin(){
        
    }
    public double cvcil(){
       double vc=2*(super.calcularVolumen()*super.getR())+2*(super.calcularVolumen()*super.getH()*super.getR())/super.getR();
        return vc;
                
    }
}
