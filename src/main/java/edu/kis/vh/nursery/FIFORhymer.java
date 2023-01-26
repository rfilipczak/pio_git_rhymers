package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    public DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!isEmpty()) {
            rhymer.countIn(super.countOut());
        }

        int ret = rhymer.countOut();

        while (!rhymer.isEmpty()) {
            countIn(rhymer.countOut());
        }

        return ret;
    }
}
