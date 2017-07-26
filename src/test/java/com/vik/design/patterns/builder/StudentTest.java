package com.vik.design.patterns.builder;

import org.junit.Assert;
import org.junit.Test;

import com.vik.design.patterns.builder.Student.Builder;

public class StudentTest {

    @Test
    public void studentBuilderTest() {
        Student student = new Builder().addFirstName("larry").addLastName("king").build();
        Assert.assertEquals("larry", student.firstName);
        Assert.assertEquals("king", student.lastName);
    }

}
