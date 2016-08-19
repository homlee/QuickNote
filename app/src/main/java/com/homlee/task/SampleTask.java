package com.homlee.task;

import android.content.Context;

import com.homlee.quicknote.R;

public abstract class SampleTask extends GenericTask{

	abstract public void onPostExecuteResult(TaskResult result);
	
	abstract public void onTaskCancelled();
	
	public Context mContext;
	
	public SampleTask(Context context) {
		mContext = context;
		this.init();
	}
	
	public void executeTask(){
		this.execute(new TaskParams());
	}
	
	public void init(){
		
		this.setListener(new TaskListener(){

			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return "SampleTask";
			}

			@Override
			public void onPreExecute(GenericTask task) {
				TaskFeedback.getInstance(TaskFeedback.DIALOG_MODE, mContext)
				.start(mContext.getString(R.string.please_waiting));
				
			}

			@Override
			public void onPostExecute(GenericTask task, TaskResult result) {
				SampleTask.this.onPostExecuteResult(result);
				TaskFeedback.getInstance(TaskFeedback.DIALOG_MODE, mContext).cancel();
			}

			@Override
			public void onProgressUpdate(GenericTask task, Object param) {
				
			}

			@Override
			public void onCancelled(GenericTask task) {
				SampleTask.this.onTaskCancelled();
			}
			
		});
	}
	
}
