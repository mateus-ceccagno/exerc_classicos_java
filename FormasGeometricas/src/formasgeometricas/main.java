package formasgeometricas;

public class main {
    public static void main(String[] args) {
        
        Quadrado fig1 = new Quadrado();
        fig1.setLado(5);
        fig1.setNome("Quadrado");
        
        Circulo fig2 = new Circulo();
        fig2.setRaio(4);
        fig2.setNome("Circulo");
        
        Triangulo fig3 = new Triangulo();
        fig3.setAltura(2);
        fig3.setBase(3);
        fig3.setNome("Triangulo");
        
        Cubo fig4 = new Cubo();
        fig4.setLado(22);
        fig4.setNome("Cubo");
        
        Cilindro fig5 = new Cilindro();
        fig5.setAltura(5);
        fig5.setRaio(1);
        fig5.setNome("Cilindro");
        
        Piramide fig6 = new Piramide();
        fig6.setAltura(4);
        fig6.setApotema(3);
        fig6.setArestaBase(2);
        fig6.setNumPoliBase(4);
        fig6.setBase(fig1);
        fig6.setNome("Piramide");
        
        Figura[] figuras = new Figura[6];
        figuras[0] = fig1;
        figuras[1] = fig2;
        figuras[2] = fig3;
        figuras[3] = fig4;
        figuras[4] = fig5;
        figuras[5] = fig6;
        
        for (Figura figura: figuras){
            System.out.println("----------------------");
            System.out.println(figura.getNome());
            
            if (figura instanceof Figura2D){
                Figura2D f2d = (Figura2D) figura;
                System.out.println(f2d.calcularArea());
            }
            
            if (figura instanceof Figura3D){
                Figura3D f3d = (Figura3D) figura;
                System.out.println(f3d.calcularArea());
                System.out.println(f3d.calcularVolume());
            }
        }
    }
    
}
