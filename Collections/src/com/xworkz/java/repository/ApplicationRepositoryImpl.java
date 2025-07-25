package com.xworkz.java.repository;

import com.xworkz.java.constant.Type;
import com.xworkz.java.constant.Version;
import com.xworkz.java.dto.ApplicationDto;
import com.xworkz.java.dto.OwnerDto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ApplicationRepositoryImpl implements ApplicationRepository{
    @Override
    public List<ApplicationDto> findAll() {
        OwnerRepositoryImpl ownerRepository=new OwnerRepositoryImpl();
        List<List<OwnerDto>> ownersAll=ownerRepository.getOwnerDto();

        ApplicationDto applicationDto1 = new ApplicationDto("WhatsApp", Type.COMMUNICATION, 36.5, LocalDate.of(2009, 1, 24), ownersAll.get(0), Version.V_1,true,0);
        ApplicationDto applicationDto2 = new ApplicationDto("Spotify", Type.ENTERTAINMENT, 78.2, LocalDate.of(2008, 10, 7), ownersAll.get(1),Version.V_2,false,199.00);
        ApplicationDto applicationDto3 = new ApplicationDto("Canva", Type.CREATIVE, 102.3, LocalDate.of(2013, 1, 1), ownersAll.get(2),Version.V_3,false,49);
        ApplicationDto applicationDto4 = new ApplicationDto("Microsoft Word", Type.PRODUCTIVITY, 287.0, LocalDate.of(1983, 10, 25), ownersAll.get(3),Version.V_4,true,249);
        ApplicationDto applicationDto5 = new ApplicationDto("Zoom", Type.COMMUNICATION, 53.8, LocalDate.of(2013, 9, 10), ownersAll.get(4),Version.V_1,true,0);
        ApplicationDto applicationDto6 = new ApplicationDto("Duolingo", Type.EDUCATION, 42.1, LocalDate.of(2011, 11, 30), ownersAll.get(5),Version.V_2,true,0);
        ApplicationDto applicationDto7 = new ApplicationDto("Google Maps", Type.TRAVEL, 128.6, LocalDate.of(2005, 2, 8), ownersAll.get(6), Version.V_3,true,0);
        ApplicationDto applicationDto8 = new ApplicationDto("Netflix", Type.ENTERTAINMENT, 89.4, LocalDate.of(2007, 1, 15), ownersAll.get(7),Version.V_4,false,199);
        ApplicationDto applicationDto9 = new ApplicationDto("Adobe Photoshop", Type.CREATIVE, 142.0, LocalDate.of(1990, 2, 19), ownersAll.get(8),Version.V_1,false,29);
        ApplicationDto applicationDto10 = new ApplicationDto("Telegram", Type.COMMUNICATION, 56.2, LocalDate.of(2013, 8, 14), ownersAll.get(9), Version.V_2,true,0);
        ApplicationDto applicationDto11 = new ApplicationDto("Instagram", Type.SOCIAL, 61.0, LocalDate.of(2010, 10, 6), ownersAll.get(10),Version.V_3,true,00);
        ApplicationDto applicationDto12 = new ApplicationDto("YouTube", Type.ENTERTAINMENT, 97.3, LocalDate.of(2005, 2, 14), ownersAll.get(11),Version.V_4,false,199);
        ApplicationDto applicationDto13 = new ApplicationDto("Slack", Type.PRODUCTIVITY, 48.5, LocalDate.of(2013, 8, 14), ownersAll.get(12),Version.V_1,false,19);
        ApplicationDto applicationDto14 = new ApplicationDto("Google Drive", Type.UTILITY, 109.2, LocalDate.of(2012, 4, 24), ownersAll.get(13),Version.V_2,true,0);
        ApplicationDto applicationDto15 = new ApplicationDto("Paytm", Type.FINANCE, 40.1, LocalDate.of(2014, 2, 10), ownersAll.get(14),Version.V_3,true,0);
        ApplicationDto applicationDto16 = new ApplicationDto("Flipkart", Type.SHOPPING, 70.0, LocalDate.of(2007, 9, 15), ownersAll.get(15),Version.V_4,true, 0);
        ApplicationDto applicationDto17 = new ApplicationDto("Amazon", Type.SHOPPING, 95.3, LocalDate.of(2008, 6, 11), ownersAll.get(16),Version.V_1,true,0);
        ApplicationDto applicationDto18 = new ApplicationDto("Apple Music", Type.ENTERTAINMENT, 80.0, LocalDate.of(2015, 6, 30), ownersAll.get(17),Version.V_2,false,299);
        ApplicationDto applicationDto19 = new ApplicationDto("Samsung Health", Type.HEALTH, 67.2, LocalDate.of(2013, 7, 10), ownersAll.get(18),Version.V_3,false,119);
        ApplicationDto applicationDto20 = new ApplicationDto("Swiggy", Type.FOOD, 45.8, LocalDate.of(2014, 8, 14), ownersAll.get(19),Version.V_4,false,199);
        ApplicationDto applicationDto21 = new ApplicationDto("Zomato", Type.FOOD, 43.5, LocalDate.of(2013, 1, 1), ownersAll.get(20),Version.V_1,false,99);
        ApplicationDto applicationDto22 = new ApplicationDto("Ola", Type.TRAVEL, 54.2, LocalDate.of(2011, 12, 3), ownersAll.get(21),Version.V_2,false,50);
        ApplicationDto applicationDto23 = new ApplicationDto("Uber", Type.TRAVEL, 60.3, LocalDate.of(2010, 5, 10), ownersAll.get(22),Version.V_3,false,50);
        ApplicationDto applicationDto24 = new ApplicationDto("Google Photos", Type.UTILITY, 82.1, LocalDate.of(2015, 5, 28), ownersAll.get(23),Version.V_4,false,13);
        ApplicationDto applicationDto25 = new ApplicationDto("PhonePe", Type.FINANCE, 39.9, LocalDate.of(2016, 8, 29), ownersAll.get(24),Version.V_1,true,0);
        ApplicationDto applicationDto26 = new ApplicationDto("Twitter", Type.SOCIAL, 59.0, LocalDate.of(2006, 3, 21), ownersAll.get(25),Version.V_2,true,0);
        ApplicationDto applicationDto27 = new ApplicationDto("LinkedIn", Type.SOCIAL, 78.0, LocalDate.of(2003, 5, 5), ownersAll.get(26),Version.V_3,false,59);
        ApplicationDto applicationDto28 = new ApplicationDto("TCS Careers", Type.EDUCATION, 50.0, LocalDate.of(2010, 1, 1), ownersAll.get(27),Version.V_4,false,9);
        ApplicationDto applicationDto29 = new ApplicationDto("Infosys Connect", Type.EDUCATION, 52.5, LocalDate.of(2011, 7, 19), ownersAll.get(28),Version.V_1,false,17);
        ApplicationDto applicationDto30 = new ApplicationDto("Wipro Desk", Type.UTILITY, 49.3, LocalDate.of(2012, 3, 25), ownersAll.get(29),Version.V_2, false,19);
        ApplicationDto applicationDto31 = new ApplicationDto("Capgemini Hub", Type.UTILITY, 47.8, LocalDate.of(2011, 6, 5), ownersAll.get(30), Version.V_3, true, 0);
        ApplicationDto applicationDto32 = new ApplicationDto("Accenture Go", Type.PRODUCTIVITY, 44.6, LocalDate.of(2013, 9, 9), ownersAll.get(31), Version.V_4, true, 0);
        ApplicationDto applicationDto33 = new ApplicationDto("Snapchat", Type.SOCIAL, 62.2, LocalDate.of(2011, 9, 1), ownersAll.get(32), Version.V_1, true, 0);
        ApplicationDto applicationDto34 = new ApplicationDto("Pinterest", Type.CREATIVE, 75.4, LocalDate.of(2010, 3, 10), ownersAll.get(33), Version.V_2, true, 0);
        ApplicationDto applicationDto35 = new ApplicationDto("Dropbox", Type.UTILITY, 85.1, LocalDate.of(2008, 9, 11), ownersAll.get(34), Version.V_3, false, 12);
        ApplicationDto applicationDto36 = new ApplicationDto("Asana", Type.PRODUCTIVITY, 66.9, LocalDate.of(2012, 4, 1), ownersAll.get(35), Version.V_4, false, 11);
        ApplicationDto applicationDto37 = new ApplicationDto("Notion", Type.PRODUCTIVITY, 73.4, LocalDate.of(2016, 3, 1), ownersAll.get(36), Version.V_1, false, 8);
        ApplicationDto applicationDto38 = new ApplicationDto("Koo", Type.SOCIAL, 34.0, LocalDate.of(2020, 3, 10), ownersAll.get(37), Version.V_2, true, 0);
        ApplicationDto applicationDto39 = new ApplicationDto("ShareChat", Type.SOCIAL, 48.5, LocalDate.of(2015, 1, 10), ownersAll.get(38), Version.V_3, true, 0);
        ApplicationDto applicationDto40 = new ApplicationDto("Dream11", Type.ENTERTAINMENT, 92.0, LocalDate.of(2012, 6, 18), ownersAll.get(39), Version.V_4, false, 49);
        ApplicationDto applicationDto41 = new ApplicationDto("Myntra", Type.SHOPPING, 60.0, LocalDate.of(2007, 11, 9), ownersAll.get(40), Version.V_1, true, 0);
        ApplicationDto applicationDto42 = new ApplicationDto("Ajio", Type.SHOPPING, 58.4, LocalDate.of(2016, 3, 1), ownersAll.get(41), Version.V_2, true, 0);
        ApplicationDto applicationDto43 = new ApplicationDto("Hotstar", Type.ENTERTAINMENT, 102.0, LocalDate.of(2015, 2, 11), ownersAll.get(42), Version.V_3, false, 149);
        ApplicationDto applicationDto44 = new ApplicationDto("Disney+ Hotstar", Type.ENTERTAINMENT, 110.0, LocalDate.of(2020, 4, 3), ownersAll.get(43), Version.V_4, false, 299);
        ApplicationDto applicationDto45 = new ApplicationDto("Gaana", Type.ENTERTAINMENT, 66.6, LocalDate.of(2010, 4, 1), ownersAll.get(44), Version.V_1, false, 99);
        ApplicationDto applicationDto46 = new ApplicationDto("JioSaavn", Type.ENTERTAINMENT, 79.8, LocalDate.of(2007, 5, 1), ownersAll.get(45), Version.V_2, false, 99);
        ApplicationDto applicationDto47 = new ApplicationDto("Tinder", Type.SOCIAL, 49.9, LocalDate.of(2012, 9, 12), ownersAll.get(46), Version.V_3, false, 499);
        ApplicationDto applicationDto48 = new ApplicationDto("Bumble", Type.SOCIAL, 52.2, LocalDate.of(2014, 12, 1), ownersAll.get(47), Version.V_4, false, 299);
        ApplicationDto applicationDto49 = new ApplicationDto("Coursera", Type.EDUCATION, 61.4, LocalDate.of(2012, 4, 18), ownersAll.get(48), Version.V_1, false, 1599);
        ApplicationDto applicationDto50 = new ApplicationDto("Udemy", Type.EDUCATION, 74.7, LocalDate.of(2010, 5, 11), ownersAll.get(49), Version.V_2, false, 499);


        List<ApplicationDto> applicationDTOs=new ArrayList<>();
        applicationDTOs.add(applicationDto1);
        applicationDTOs.add(applicationDto2);
        applicationDTOs.add(applicationDto3);
        applicationDTOs.add(applicationDto4);
        applicationDTOs.add(applicationDto5);
        applicationDTOs.add(applicationDto6);
        applicationDTOs.add(applicationDto7);
        applicationDTOs.add(applicationDto8);
        applicationDTOs.add(applicationDto9);
        applicationDTOs.add(applicationDto10);
        applicationDTOs.add(applicationDto11);
        applicationDTOs.add(applicationDto12);
        applicationDTOs.add(applicationDto13);
        applicationDTOs.add(applicationDto14);
        applicationDTOs.add(applicationDto15);
        applicationDTOs.add(applicationDto16);
        applicationDTOs.add(applicationDto17);
        applicationDTOs.add(applicationDto18);
        applicationDTOs.add(applicationDto19);
        applicationDTOs.add(applicationDto20);
        applicationDTOs.add(applicationDto21);
        applicationDTOs.add(applicationDto22);
        applicationDTOs.add(applicationDto23);
        applicationDTOs.add(applicationDto24);
        applicationDTOs.add(applicationDto25);
        applicationDTOs.add(applicationDto26);
        applicationDTOs.add(applicationDto27);
        applicationDTOs.add(applicationDto28);
        applicationDTOs.add(applicationDto29);
        applicationDTOs.add(applicationDto30);
        applicationDTOs.add(applicationDto31);
        applicationDTOs.add(applicationDto32);
        applicationDTOs.add(applicationDto33);
        applicationDTOs.add(applicationDto34);
        applicationDTOs.add(applicationDto35);
        applicationDTOs.add(applicationDto36);
        applicationDTOs.add(applicationDto37);
        applicationDTOs.add(applicationDto38);
        applicationDTOs.add(applicationDto39);
        applicationDTOs.add(applicationDto40);
        applicationDTOs.add(applicationDto41);
        applicationDTOs.add(applicationDto42);
        applicationDTOs.add(applicationDto43);
        applicationDTOs.add(applicationDto44);
        applicationDTOs.add(applicationDto45);
        applicationDTOs.add(applicationDto46);
        applicationDTOs.add(applicationDto47);
        applicationDTOs.add(applicationDto48);
        applicationDTOs.add(applicationDto49);
        applicationDTOs.add(applicationDto50);

        return applicationDTOs;
    }
}
