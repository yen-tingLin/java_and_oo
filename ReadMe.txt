
在 terminal 執行 java 檔案
===============================

方法一：在 src 資料夾

1. 進到 pakage 中，找到 xxx.java 檔案
2. 在 terminal 中輸入指令 : javac  a.class b.class 
   (main 和所有其他會用到的 class 檔案都要輸入)
3. 回上一層 : cd ..
4. 執行 : java  pakage_name.main_class_name
5. 每次檔案有更動都要從 step 1 開始

...............................

方法二：在 out 資料夾 (recommanded)

1. 一直往下層，直到找到要執行的 xxx.class 檔案
2. 直接執行 : java  main_class_name
