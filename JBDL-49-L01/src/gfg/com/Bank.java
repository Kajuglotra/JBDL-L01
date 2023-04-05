package gfg.com;

public enum Bank {

    SBI(0, "state Bank of India"), HDFC(1, "Hdfc"), ICICI(2, "ICICI");
    int bankId;
    String bankName;

    Bank(int bankId, String bankName) {
        this.bankId = bankId;
        this.bankName = bankName;
    }
}
