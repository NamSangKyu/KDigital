package event;

public abstract class View {
	
	private OnClickListener onClickListener;

	public void setOnClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}
	
	public void onClick() {
		if(onClickListener != null)
			onClickListener.onClick(this);
	}
	
	public static interface OnClickListener{
		public void onClick(View view);
	}
	
}
