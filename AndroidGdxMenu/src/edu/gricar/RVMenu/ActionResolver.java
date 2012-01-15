package edu.gricar.RVMenu;
public interface ActionResolver {
	public void showToast(CharSequence toastMessage, int toastDuration);
	public void showAlertBox(String alertBoxTitle, String alertBoxMessage, String alertBoxButtonText);
	public void openUri(String uri);
	public void showMyList();
	public void closeapp();
}
