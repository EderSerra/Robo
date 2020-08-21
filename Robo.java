package exercicios.Robo;

public class Robo {
    // atributos
    private char deslocamento;
    private int posHor = 0, posVert = 0;

    // construtor
    Robo(char deslocamento){
            this.deslocamento = deslocamento;    
        }

    // métodos
    public int desloc(Char desloc) {

        while ((posVert > 0 && posVert < 11) && posHor > 0 && posHor < 11) {
            if (desloc = "N") {
                posVert++;
                return posHor;
                return posVert;
            } else {
                if (desloc = "S") {
                    posVert--;
                    return posHor;
                    return posVert;
                } else {
                    if (desloc = "O") {
                        posHor++;
                        return posHor;
                        return posVert;
                    } else {
                        if (desloc = "L") {
                            posHor--;
                            return posHor;
                            return posVert;
                        } else {
                            System.out.println("Opção inválida");
                        }
                    }
                }
            }
        }

    }
}

}