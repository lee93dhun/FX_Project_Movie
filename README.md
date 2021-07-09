# FX_Project_Movie

# 1. 주제 : 영화예매프로그램

# 2. 개발툴 : JDK11 , JavaFX , SceneBuilder , MYSQL

# 3. 사용되는 클래스

## DB명 : javafx_movie

### Table
### 1.영화(movie)

```mysql
create table javafx_movie.movie(
mno int primary key auto_increment,
mtitle varchar(20) not null,
mgenre varchar(20) not null,
moutline varchar(20) not null,
mrelease varchar(20) not null,
mrating varchar(20) not null,
mprice int not null,
mimage varchar(1000) not null,
mcondition int not null
);
```


### 2.예매(reservation)

```mysql
create table javafx_movie.reservation(
	rno int primary key auto_increment,
    mno int not null,
	FOREIGN KEY (mno) REFERENCES movie(mno),
	mseat varchar(100) not null,
	rtime varchar(45) not null,
    person int not null	
)
```
------------------------------
# 4. SceneBuilder FXML



# 5. 담당

## 이도훈
```
 관리자 프로그램
 FXML
 
```

## 문주연
```
DB


```

## 박주성
```
클래스 설계

```

