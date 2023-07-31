public class LaptopServiceImp implements LaptopInterface{

    @Override
    public Laptop createLaptop(Laptop laptop) {

        Laptop laptop1 = new Laptop();
        laptop1.setLaptopNumber(laptop.getLaptopNumber());
        laptop1.setName(laptop.getName());
        laptop1.setModel(laptop.getModel());
        laptop1.setPrice(laptop.getPrice());
        return laptop1;

    }

}
