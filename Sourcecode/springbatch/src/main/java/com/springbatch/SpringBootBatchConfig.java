package com.springbatch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;

import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class SpringBootBatchConfig {

    /**
     * A Job is made up of many steps and each step is
     *  a READ-PROCESS-WRITE task or a single operation task (tasklet).
     * @return job
     */
    @Bean
    public Job simpleJob(JobRepository jobRepository,
                             JobCompletionNotificationListener listener, Step step1) {
        return new JobBuilder("simpleJob", jobRepository)
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .flow(step1)
                .end()
                .build();
    }
    /**
     * Step consist of an ItemReader, ItemProcessor and an ItemWriter.
     * @return step
     */

    @Bean
    public Step step1(JobRepository jobRepository,
                      PlatformTransactionManager transactionManager) {
        return new StepBuilder("step1", jobRepository)
                .<String, String> chunk(1)
                .reader(new MessageReader())
                .processor(new MessageProcessor())
                .writer(new MessageWriter())
                .build();
    }
}