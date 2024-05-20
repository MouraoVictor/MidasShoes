package model;

public class FeedBack {
    private String id_pedido;
    private String cpf;
    private String feedback;

    public FeedBack(String id_pedido, String cpf, String feedback) {
        this.id_pedido = id_pedido;
        this.cpf = cpf;
        this.feedback = feedback;
    }

    public String getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(String id_pedido) {
        this.id_pedido = id_pedido;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    
    
}
