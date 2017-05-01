package com.kushal.orctotext.config;

import java.io.IOException;

import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.util.Tool;

public class ProcessDriver extends Configured implements Tool {


  public static void main(String[] args) throws Exception {

  }


  /**
   * @param input
   * @param job
   */
  private void setConfigJobFileType(final InputConfig input, final Job job) {}

  /**
   * @param input
   * @param job
   * @throws IOException
   */
  private void setHiveJars(final InputConfig input, final Job job) throws IOException {}


  public int run(String[] args) throws Exception {
    // TODO Auto-generated method stub
    return 0;
  }
}
