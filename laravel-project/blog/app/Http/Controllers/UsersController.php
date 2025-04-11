<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;


class UsersController extends Controller
{
    //
    function queries(){
        // $result=DB::table('users')->get() ;
        // $result=DB::table('users')->where('name','Prashastha')->get() ;
        
        // $result=DB::table('users')->insert([
        //     'name'=>'tony',
        //     'email'=>'tony@test.com',
        //     'phone'=>12323
        // ]) ;
        // if($result){
        //     return "Data inserted";
        // }
        // else{
        //     return "Data inserted";
        // }

        $result=DB::table('users')->where('name','Rahul')->delete();
        if($result){
                return "Data deleted";
            }
            else{
                return "Data not deleted";
            }
    

        return view('users',['users'=>$result]);
    }
}
