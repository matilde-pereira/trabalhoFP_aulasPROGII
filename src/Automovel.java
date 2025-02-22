public class Automovel {

    private String matricula;
    private String marca;
    private int cilindrada;

    private static final String MATRICULA_POR_OMISSAO = "sem matrícula";
    private static final String MARCA_POR_OMISSAO = "sem marca";
    private static final int CILINDRADA_POR_OMISSAO = 0;

    private static int totalAutomoveis = 0;

    public Automovel() {
        matricula = MATRICULA_POR_OMISSAO;
        marca = MARCA_POR_OMISSAO;
        cilindrada = CILINDRADA_POR_OMISSAO;
        totalAutomoveis++;
    }

    public Automovel(String matricula, String marca, int cilindrada) {
        this.matricula=matricula;
        this.marca=marca;
        this.cilindrada=cilindrada;
        totalAutomoveis++;
    }

    public Automovel(String matricula, String marca) {
        this.matricula=matricula;
        this.marca=marca;
        cilindrada = CILINDRADA_POR_OMISSAO;
        totalAutomoveis++;
    }

    public Automovel(String marca, int cilindrada) {
        this.marca=marca;
        this.cilindrada=cilindrada;
        matricula = MATRICULA_POR_OMISSAO;
        totalAutomoveis++;
    }

    public Automovel(int cilindrada, String matricula) {
        this.matricula=matricula;
        this.cilindrada=cilindrada;
        marca = MARCA_POR_OMISSAO;
        totalAutomoveis++;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setMatricula(String matricula) {
        this.matricula=matricula;
    }

    public void setMarca(String marca) {
        this.marca=marca;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada=cilindrada;
    }

    public String toString() {
        return  "O automóvel com matrícula" + matricula + "é um" + marca + "de" + cilindrada + "cc.";
    }

    public int calcularDiferencaCilindrada(Automovel outroAutomovel) {
        return cilindrada - outroAutomovel.getCilindrada();
        // a implementar
    }

    public boolean isCilindradaMaior(Automovel outroAutomovel) {
        return cilindrada > outroAutomovel.cilindrada ;
    }

    public boolean isCilindradaMaior(int cilindrada) {
        return this.cilindrada > cilindrada;
    }

    public static int getTotalAutomoveis() {
        return totalAutomoveis;
    }
}