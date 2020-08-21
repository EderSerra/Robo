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
        Coord[] ord;

        while ((posVert > 0 && posVert < 11) && posHor > 0 && posHor < 11) {
            if (desloc = "N") {
                posVert++;
                ord[1] = posHor;
                ord[2] = posVert;
                return ord;
            } else {
                if (desloc = "S") {
                    posVert--;
                    ord[1] = posHor;
                    ord[2] = posVert;
                    return ord;
                } else {
                    if (desloc = "O") {
                        posHor++;
                        ord[1] = posHor;
                        ord[2] = posVert;
                        return ord;
                    } else {
                        if (desloc = "L") {
                            posHor--;
                            ord[1] = posHor;
                            ord[2] = posVert;
                            return ord;
                        } else {
                            ord[1] = 99
                            ord[2] = 99
                        }
                    }
                }
            }
        }

    }
}

}