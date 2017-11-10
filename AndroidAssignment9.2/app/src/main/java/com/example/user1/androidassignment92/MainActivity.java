package com.example.user1.androidassignment92;

/*
This Assignment is an example of option menu
if click toat messsage will appear
 */

// imported required class
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

//class starts here
public class MainActivity extends AppCompatActivity {

    // on creat method works as main method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // get support for action bar for menu
        getSupportActionBar();
    }


    @Override
    // oc creat option menu method just to creat a layout on menu by menu iflater
    public boolean onCreateOptionsMenu(Menu menu) {
        // menu inflater class to get menu layout
        MenuInflater inflate= getMenuInflater();

        // this how we get layout on infalte variable
        inflate.inflate(R.menu.menu,menu);

        // returns menu
        return super.onCreateOptionsMenu(menu);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // get item id in id variable
        int id= item.getItemId();
        //if id same the tost
        if (id==R.id.computer){

            Toast.makeText(MainActivity.this,"You Have Clicked On Computer",Toast.LENGTH_SHORT).show();
        }else if (id==R.id.gamepad){

            Toast.makeText(MainActivity.this,"You Have Clicked On game pad",Toast.LENGTH_SHORT).show();
        } else if(id==R.id.camera){

        Toast.makeText(MainActivity.this,"You Have Clicked On CAMERA",Toast.LENGTH_SHORT).show();
    }else if (id==R.id.email){

        Toast.makeText(MainActivity.this,"You Have Clicked Email",Toast.LENGTH_SHORT).show();
    }else if (id==R.id.video){

        Toast.makeText(MainActivity.this,"You Have Clicked On Video",Toast.LENGTH_SHORT).show();
    }
        // returns Items
        return super.onOptionsItemSelected(item);
    }
}//class closed
