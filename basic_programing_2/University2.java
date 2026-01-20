class University{
    public static void main(String args[]) {

        int fee = 235000;
        int discountPercent = 10;

        int discount = fee * discountPercent / 100;
        int finalFee = fee - discount;

        System.out.println("The discount amount is  " + discount +
                " and final discounted fee is " + finalFee);
}
}