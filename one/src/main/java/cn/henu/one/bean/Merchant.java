package cn.henu.one.bean;

import java.util.Arrays;

public class Merchant {

    private String merchant_id;
    private String nickname;
    private String[] product_id;

    public String getMerchant_id() {
        return merchant_id;
    }

    public void setMerchant_id(String merchant_id) {
        this.merchant_id = merchant_id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String[] getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String[] product_id) {
        this.product_id = product_id;
    }

    @Override
    public String toString() {
        return "merchant{" +
                "merchant_id='" + merchant_id + '\'' +
                ", nickname='" + nickname + '\'' +
                ", product_id=" + Arrays.toString(product_id) +
                '}';
    }
}
