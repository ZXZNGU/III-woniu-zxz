package com.woniu.w1d2springiocannotation;

import com.woniu.w1d2springiocannotation.controller.*;
import com.woniu.w1d2springiocannotation.entity.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        CarController carController = applicationContext.getBean(CarController.class);
        Car car = new Car("v6引擎", "米其林", "福耀玻璃");
        carController.addCar(car);

        AirplaneController airplaneController = applicationContext.getBean(AirplaneController.class);
        Airplane airplane = new Airplane("V12引擎","米其林","福耀玻璃");
        airplaneController.addAirplane(airplane);

        AlbumController albumController = applicationContext.getBean(AlbumController.class);
        Album album = new Album("129.5","Taylor",15);
        albumController.addAlbum(album);

        ComputerController computerController = applicationContext.getBean(ComputerController.class);
        Computer computer = new Computer("英特尔","戴尔显示屏","三星硬盘");
        computerController.addComputer(computer);

        GlassCupController glassCupController = applicationContext.getBean(GlassCupController.class);
        GlassCup glassCup = new GlassCup("福特玻璃","圣路易");
        glassCupController.addGlassCup(glassCup);

        LiquorController liquorController = applicationContext.getBean(LiquorController.class);
        Liquor liquor = new Liquor("福特玻璃","50%");
        liquorController.addLiquor(liquor);

        PhoneController phoneController = applicationContext.getBean(PhoneController.class);
        Phone phone = new Phone("戴尔显示屏","品胜电池");
        phoneController.addPhone(phone);

        ShirtController shirtController = applicationContext.getBean(ShirtController.class);
        Shirt shirt = new Shirt("cotton","圆领");
        shirtController.addShirt(shirt);

        SneakerController sneakerController = applicationContext.getBean(SneakerController.class);
        Sneaker sneaker = new Sneaker("basketball","rubber","Nike");
        sneakerController.addSneaker(sneaker);

        TrainController trainController = applicationContext.getBean(TrainController.class);
        Train train = new Train("iron","v6引擎", "米其林", "福耀玻璃");
        trainController.addTrain(train);

        UmbrellaController umbrellaController = applicationContext.getBean(UmbrellaController.class);
        Umbrella umbrella = new Umbrella("dacron","天堂伞");
        umbrellaController.addUmbrella(umbrella);
    }
}
