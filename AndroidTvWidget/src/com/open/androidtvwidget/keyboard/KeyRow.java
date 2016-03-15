package com.open.androidtvwidget.keyboard;

import java.util.ArrayList;
import java.util.List;

/**
 * 按键的列数组.
 * 
 * @author hailong.qiu 356752238@qq.com
 *
 */
public class KeyRow {

	private List<SoftKey> mSoftKeys = new ArrayList<SoftKey>();
	public int mRowId;
	//
	public float mTopF;
	public float mBottomF;
	public int mTop;
	public int mBottom;

	public List<SoftKey> getSoftKeys() {
		return mSoftKeys;
	}

	public void setSoftKeys(List<SoftKey> mSoftKeys) {
		this.mSoftKeys = mSoftKeys;
	}

}