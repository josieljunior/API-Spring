package com.api.test.config.validate;

public class ErroDeFormDto {

    private String field;
    private String erro;

    public ErroDeFormDto(String field, String erro) {
        this.field = field;
        this.erro = erro;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getErro() {
        return erro;
    }

    public void setErro(String erro) {
        this.erro = erro;
    }
}
