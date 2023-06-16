package generic;

import interfaces.interRoti;

public class Tokoroti<t, T> implements interRoti<T> {

    private t tokorotiT;

    protected void setTokoroti(T TokoRoti) {
        this.tokorotiT = TokoRoti;
    }

    protected T getTokorotiT() {
        return tokorotiT;
    }

    @Override
    public void beliRotiDong() {
        throw new UnsupportedOperationException("Unimplemented method 'beliRotiDong'");
    }

    @Override
    public void gaJadiBeliRotiDong() {
        throw new UnsupportedOperationException("Unimplemented method 'gaJadiBeliRotiDong'");
    }
}