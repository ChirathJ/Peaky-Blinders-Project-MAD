// Generated by view binder compiler. Do not edit!
package com.example.mad.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mad.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MyRowBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final LinearLayout mainLayout;

  @NonNull
  public final TextView stockCategoryTxt;

  @NonNull
  public final TextView stockIdTxt;

  @NonNull
  public final TextView stockNameTxt;

  @NonNull
  public final TextView stockQuantityTxt;

  private MyRowBinding(@NonNull LinearLayout rootView, @NonNull CardView cardView,
      @NonNull LinearLayout mainLayout, @NonNull TextView stockCategoryTxt,
      @NonNull TextView stockIdTxt, @NonNull TextView stockNameTxt,
      @NonNull TextView stockQuantityTxt) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.mainLayout = mainLayout;
    this.stockCategoryTxt = stockCategoryTxt;
    this.stockIdTxt = stockIdTxt;
    this.stockNameTxt = stockNameTxt;
    this.stockQuantityTxt = stockQuantityTxt;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MyRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MyRowBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.my_row, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MyRowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardView;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      LinearLayout mainLayout = (LinearLayout) rootView;

      id = R.id.stock_category_txt;
      TextView stockCategoryTxt = ViewBindings.findChildViewById(rootView, id);
      if (stockCategoryTxt == null) {
        break missingId;
      }

      id = R.id.stock_id_txt;
      TextView stockIdTxt = ViewBindings.findChildViewById(rootView, id);
      if (stockIdTxt == null) {
        break missingId;
      }

      id = R.id.stock_name_txt;
      TextView stockNameTxt = ViewBindings.findChildViewById(rootView, id);
      if (stockNameTxt == null) {
        break missingId;
      }

      id = R.id.stock_quantity_txt;
      TextView stockQuantityTxt = ViewBindings.findChildViewById(rootView, id);
      if (stockQuantityTxt == null) {
        break missingId;
      }

      return new MyRowBinding((LinearLayout) rootView, cardView, mainLayout, stockCategoryTxt,
          stockIdTxt, stockNameTxt, stockQuantityTxt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
