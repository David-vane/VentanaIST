    package recuperacion.app.myapplication;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.Menu;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;


import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import org.imaginativeworld.whynotimagecarousel.CarouselItem;
import org.imaginativeworld.whynotimagecarousel.ImageCarousel;

import java.util.ArrayList;
import java.util.List;

import ahmed.easyslider.EasySlider;
import ahmed.easyslider.SliderItem;

    public class MainActivity extends AppCompatActivity {


    private AppBarConfiguration mAppBarConfiguration;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = findViewById(R.id.fab);
        //metodo para que nos lleve directo a la llamada
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Intent.ACTION_VIEW, Uri.parse("tel:593072613865"));
                startActivity(i);
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        //Pasando cada ID de menú como un conjunto de ID porque cada
        //El menú debe considerarse como destinos de primer nivel.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow, R.id.nav_wikitude, R.id.nav_equipo)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflar el menú; esto agrega elementos a la barra de acción si está presente
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
    //metodo para que nos redireccione a la aplicacion de wikitude
    public void onClick(View v) {
        String nombre_paquete = "com.wikitude.wikitudestudioandroidapptemplate";
        Intent i = new Intent();
        PackageManager manager = getPackageManager();
        i = manager.getLaunchIntentForPackage(nombre_paquete);
        i.addCategory(Intent.CATEGORY_LAUNCHER);
        startActivity(i);
    }
        //Metodos para redireccionar a una direccion web
    public void Whatsapp(View view) {
        Intent i= new Intent(Intent.ACTION_VIEW, Uri.parse("https://tecnologicoloja.edu.ec/"));
        startActivity(i);
    }
    public void Facebook(View view) {
        Intent i= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/TecnologicoLoja/"));
        startActivity(i);
    }
    public void Instagram(View v){
        Intent i = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/tecnologicoloja/"));
        startActivity(i);

    }

    public void ActaAprobacion(View view){
        Intent i = new Intent (Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1D6n5Hq7GbRwcfMIRH3rvheKEjU12uU-8/view"));
        startActivity(i);
    }
        public void ActaAprobacionCes(View view){
            Intent i = new Intent (Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1iwjj_SWGnuknFBcmOOz2Rd766TgG7PZw/view"));
            startActivity(i);
        }
        public void ActaAprobado(View view){
            Intent i = new Intent (Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Hi2dRr12ubhkSU7o6oXR0trdEZit9g2e/view"));
            startActivity(i);
        }
        public void PlanOperativo19(View view){
            Intent i = new Intent (Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1qixha4ujQm0ege69QKBoTGGjmRH2ZqT-/view"));
            startActivity(i);
        }
        public void PlanOperativo20(View view){
            Intent i = new Intent (Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1-UnD0PJbpSPHgrI_qvqO9_NedpGNaXlp/view"));
            startActivity(i);
        }
        public void PlanEstrategico(View view){
            Intent i = new Intent (Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1D6n5Hq7GbRwcfMIRH3rvheKEjU12uU-8/view"));
            startActivity(i);
        }
}