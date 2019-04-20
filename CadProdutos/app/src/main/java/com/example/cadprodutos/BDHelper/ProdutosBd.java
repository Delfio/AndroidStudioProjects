package com.example.cadprodutos.BDHelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.ArrayList;

public class ProdutosBd extends SQLiteOpenHelper {

    private static final String DATABASE ="bdprodutos";
    private static final int VERSION = 1;

    public ProdutosBd (Context context){
        super(context, DATABASE,null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String produto = "CREATE TABLE produtos(id INTER PRIMARY KEY AUTOINCREMENT NOT NULL, nomeproduto TEXT NOT NULL, descricao TEXT NOT NULL, quantidade INTEGER);";
        db.execSQL(produto);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String produto = "DROP TABLE IF EXISTS produtos";
        db.execSQL(produto);
    }

    public void salvarProduto(ProdutosBd produto){
        ContentValues values = new ContentValues();

        values.put("nomeproduto", produto.getDatabaseName());
        values.put("descricao", produto.getDatabaseName());
        values.put("quantidade", produto.getDatabaseName());

        getWritableDatabase().insert("produtos",null,values);

    }

    @RequiresApi(api = Build.VERSION_CODES.O_MR1)
    public ArrayList<ProdutosBd> getLista(){
        String columns =["id", "nomeproduto","descricao","quantidade"];
        Cursor cursor = getWritableDatabase() .query("produtos",columns,null, null, null, null, null, null);
        ArrayList<ProdutosBd> produtos = new ArrayList<ProdutosBd>();

        while (cursor.moveToNext()){
            ProdutosBd produtosBd = new ProdutosBd();
            produtosBd.setIdleConnectionTimeout(cursor.getString(1));
            produtos.setDescricao
        }

    }

    private void setIdleConnectionTimeout(String string) {
    }
}
