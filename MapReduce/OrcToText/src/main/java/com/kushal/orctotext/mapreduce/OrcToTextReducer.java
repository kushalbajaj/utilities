package com.kushal.orctotext.mapreduce;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class OrcToTextReducer extends Reducer<Text, Text, Text, Text> {


  @Override
  protected void cleanup(Context context) throws IOException, InterruptedException {

    super.cleanup(context);
  }

  @Override
  public void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {

  }

  @Override
  protected void setup(Context context) throws IOException, InterruptedException {
    super.setup(context);

  }
}
