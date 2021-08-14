package API.error;

/*
 * バージョン情報
 * 初版 2021/05/01 T.Fukui
 *
 */

public class ErrorApi
{

	Error error = new Error();

	// エラー
	public void ErrorMessage(String ErrorMessage)
	{
		// エラーメッセージを表示
		error.getCause();
		System.out.println("エラー:"+ErrorMessage);

	}

}
