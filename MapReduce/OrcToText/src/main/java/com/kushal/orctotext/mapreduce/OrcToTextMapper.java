package com.kushal.orctotext.mapreduce;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;


public class OrcToTextMapper extends Mapper<LongWritable, Text, Text, Text> {


  @Override
  protected void cleanup(Context context) throws IOException, InterruptedException {
    super.cleanup(context);
  }

  @Override
  protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, Text>.Context context) throws IOException, InterruptedException {}

  @Override
  protected void setup(Context context) throws IOException, InterruptedException {
    super.setup(context);
  }
}
