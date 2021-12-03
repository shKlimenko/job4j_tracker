package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ProfilesTest {
    @Test
    public void whenCollectAdress() {
        Address adr1 = new Address("Shakhty", "Lenina", 220, 2);
        Address adr2 = new Address("Rostov-on-Don", "Cheremukhina", 17, 7);
        Address adr3 = new Address("Volgograd", "Malogvardeiskaya", 999, 666);

        Profile prof1 = new Profile(adr1);
        Profile prof2 = new Profile(adr2);
        Profile prof3 = new Profile(adr3);

        List<Profile> profList = List.of(prof1, prof2, prof3);
        List<Address> expected = List.of(adr1, adr2, adr3);

        Profiles profiles = new Profiles();
        List<Address> rsl = profiles.collect(profList);

        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCollectAdressWithSort() {
        Address adr1 = new Address("Shakhty", "Lenina", 220, 2);
        Address adr2 = new Address("Rostov-on-Don", "Cheremukhina", 17, 7);
        Address adr3 = new Address("Shakhty", "Lenina", 220, 2);
        Address adr4 = new Address("Volgograd", "Malogvardeiskaya", 999, 666);
        Address adr5 = new Address("Shakhty", "Lenina", 220, 2);

        Profile prof1 = new Profile(adr1);
        Profile prof2 = new Profile(adr2);
        Profile prof3 = new Profile(adr3);
        Profile prof4 = new Profile(adr4);
        Profile prof5 = new Profile(adr5);

        List<Profile> profList = List.of(prof1, prof2, prof3, prof4, prof5);
        List<Address> expected = List.of(adr2, adr1, adr4);

        Profiles profiles = new Profiles();
        List<Address> rsl = profiles.collectWithSort(profList);

        assertThat(rsl, is(expected));
    }
}