package com.springbatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * ItemWriter
 */
public class MessageWriter implements ItemWriter<String> {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void write(Chunk<? extends String> inputMessage) throws Exception {
        for (String outputMsg : inputMessage) {
            System.out.println("Received input data from Step:- " + outputMsg);
        }
    }
}
