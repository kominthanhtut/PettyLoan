package com.yixun.pettyloan.ui.fragment;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.yixun.pettyloan.R;
import com.yixun.pettyloan.ui.base.BaseSupportFragment;

import butterknife.BindView;
import butterknife.OnClick;

public class PaymentFragment extends BaseSupportFragment {
    private String mTitle;
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.tv_title)
    TextView mTvTitle;
    @BindView(R.id.tv_select_way)
    TextView mTvSelectWay;
    @BindView(R.id.iv_add_bank_card_select)
    ImageView mABCSelectIv;
    @BindView(R.id.iv_wechat_pay_select)
    ImageView mWPSelectIv;

    public static PaymentFragment getInstance(String title) {
        PaymentFragment sf = new PaymentFragment();
        sf.mTitle = title;
        return sf;
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_pay;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    protected void initView() {
        initToolbar();
        mTvSelectWay.setText(getString(R.string.pay_select_way));
    }

    @Override
    protected void initData() {
    }

    private void initToolbar() {
        mTvTitle.setText(mTitle);
    }

    @OnClick({R.id.iv_back, R.id.ll_add_bank_card_root, R.id.ll_wechat_pay_root})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                pop();
                break;
            case R.id.ll_add_bank_card_root:
                mABCSelectIv.setVisibility(View.VISIBLE);
                mWPSelectIv.setVisibility(View.INVISIBLE);
                break;
            case R.id.ll_wechat_pay_root:
                mWPSelectIv.setVisibility(View.VISIBLE);
                mABCSelectIv.setVisibility(View.INVISIBLE);
                break;
            default:
                break;
        }
    }
}