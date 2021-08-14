package API.item;

/*
 * バージョン情報
 * 初版 2021/05/01 T.Fukui
 *
 */

import API.error.ErrorApi;
import model.item.ItemProperty;

public class ItemApi
{

	// 商品マスタ
	ItemProperty itemProp = new ItemProperty();

	// 商品マスタへ登録する値をチェック
	public boolean ItemCheck()
	{

		ErrorApi error = new ErrorApi();

		// 商品_Cのチェック
		if(itemProp.商品_C == null)
		{
			//エラーとする
			error.ErrorMessage("商品を選択していません。");

			return true;

		}

		if(itemProp.商品_C.length() < 5)
		{
			//エラーとする
			error.ErrorMessage("商品_Cが5文字ではありません。");

			return true;
		}

		// 商品区分_Cのチェック
		if(itemProp.商品区分_C == null)
		{

			// エラーとする
			error.ErrorMessage("商品区分を選択していません。");

			return true;

		}

		// 使用区分_Cのチェック
		if(itemProp.使用区分_C == null)
		{

			// エラーとする
			error.ErrorMessage("使用区分を選択していません。");

			return true;


		}

		return false;



	}









}
