package com.example.dropwizardTestPj;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import com.example.dropwizardTestPj.Sample;

public class SampleTest {

    @Test
    public void test() {
        Sample sample = new Sample();
        assertThat(sample.getMessage(), is("Sample!"));
    }
    
}
