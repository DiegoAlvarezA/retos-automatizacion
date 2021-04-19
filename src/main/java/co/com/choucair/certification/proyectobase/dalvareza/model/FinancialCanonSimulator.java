package co.com.choucair.certification.proyectobase.dalvareza.model;

public class FinancialCanonSimulator {
    private String assetValue;
    private String termContract;
    private String percentagePurchageOption;
    private String rateType;

    public String getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(String assetValue) {
        this.assetValue = assetValue;
    }

    public String getTermContract() {
        return termContract;
    }

    public void setTermContract(String termContract) {
        this.termContract = termContract;
    }

    public String getPercentagePurchageOption() {
        return percentagePurchageOption;
    }

    public void setPercentagePurchageOption(String percentagePurchageOption) {
        this.percentagePurchageOption = percentagePurchageOption;
    }

    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType;
    }
}
