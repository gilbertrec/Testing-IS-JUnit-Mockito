package modelexamples;

public class MetodoDiPagamento {
    private String card_company;
    private String nationality;
    private String id_code;

    public MetodoDiPagamento(String card_company, String nationality, String id_code) {
        this.card_company = card_company;
        this.nationality = nationality;
        this.id_code = id_code;
    }

    public String getCard_company() {
        return card_company;
    }

    public void setCard_company(String card_company) {
        this.card_company = card_company;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getId_code() {
        return id_code;
    }

    public void setId_code(String id_code) {
        this.id_code = id_code;
    }
}
