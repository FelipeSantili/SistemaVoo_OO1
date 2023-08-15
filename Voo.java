public class Voo {

    
    private int numVoo;
    private String modAviao;
    private String origem;
    private String destino;
    private String dataHoraDecolagem;
    private Passageiro[] vetPassageiro;
    private Integer numAssentos;

    public int getNumAssentosOcupados() {
        int count = 0;
        for (Passageiro passageiro : vetPassageiro) {
            if (passageiro != null) {
                count++;
            }
        }
        return count;
    }
    public int assentosRestantes() {
        return numAssentos - getNumAssentosOcupados();
    }        
    
    public void setNumAssentosOcupados(int numAssentos) {
        this.numAssentos = numAssentos;
    }

    public Integer getNumAssentos(int j) {
        return numAssentos;
    }

    public void setNumAssentos(int numAssentos) {
        this.numAssentos = numAssentos;
    }

    public Voo(){
        this.vetPassageiro = new Passageiro[1000];
    }

    public int getNumVoo(){
        return this.numVoo;
    }

    public void setNumVoo(int num){
        this.numVoo = num;
    }

    public String getModAviao(){
        return this.modAviao;
    }

    public void setModAviao(String mod){
        this.modAviao = mod;
    }

    public String getOrigem(){
        return this.origem;
    }

    public void setOrigem(String ori){
        this.origem = ori;
    }

    public String getDestino(){
        return this.destino;
    }

    public void setDestino(String des){
        this.destino = des;
    }

    public String getDataHoraDecolagem(){
        return this.dataHoraDecolagem;
    }

    public void seDataHoraDecolagem(String deco){
        this.dataHoraDecolagem = deco;
    }

    public Passageiro getPassageiro (int pass){
        return this.vetPassageiro[pass];
    }

    public void setPassageiro(int pass, Passageiro p){
        this.vetPassageiro[pass] = p;
    }


}
