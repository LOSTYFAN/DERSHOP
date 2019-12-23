# DERSHOP
#德尔商城
## 数据库设计
#### 
### t_user 用户表
##### userid         int
##### username 用户名      varchar
##### password 密码         varchar
##### realname 真实姓名   varchar
##### email 邮件                  varchar
##### phone 手机号码     varchar
##### sex 性别               sex  1男 2女
##### birthday 出生日期   date

##
### t_address 地址表
##### addid 地址表id  int
##### userid 用户表id  int
##### provinceid 省份表id   int 
##### cityid 城市表id   int 
##### areaid 区县表id   int 
##### streetid 街道表id  int
##### finaladdress   varchar

##
### t_order 订单表
##### orderid 订单号 varchar
##### userid 用户id   int 
##### createtime 下单时间  datetime
##### paystatus 付款状态 int 2已付款 1未付款
##### Totalprice 总价 double
##### content 备注 varchar
##
### t_orderdetail 订单明细表
##### orderdetailid 订单明细表id
##### orderid 订单表id varchar
##### itemsid 商品信息表id
##### num 数量
##

### t_shopcart 购物车表
##### shopcartid 购物车表id
##### userid 用户表id 
##### itemid 商品信息表id
##### num 数量
##

### t_items 商品信息表
##### itemsid 商品id
##### itemsname 商品名称
##### itemsdes 商品描述
##### itemsBrand 商品品牌
##### itemstype 商品类型
##### price 价格
##### pic 图片地址

##
### t_province 省
##### provinceid
##### province

##
### t_city 市
##### cityid
##### city
##### father
##
### t_area 区县
##### areaid
##### area
##### father
##
### t_street 街道
##### streetid
##### street
##### father

#
## 第一天 
### 初步完成登录模块
#### 1 验证码验证
#### 2 用户名验证
#### 3 密码验证
#### 验证通过后进入到商城首页,通过用户名和密码查询到的用户存放在session中。

## 第二天 
### 初步完成注册模块
#### 1 注册用户名是否存在验证
#### 2 验证码验证
#### 3 前端校验
#### 后台校验未完成，项目完善时进行详细编码

## 第三天 
### 创建各个表的实体类
### 构思项目一些细节实现

## 第四天
### 显示商品列表
#### 罗列所有商品
#### 分页待实现
#### 商品分类待实现
### 点击某个商品显示商品详细信息
#### 根据商品id查询商品信息显示到页面上

## 第五天
### 完成购物车商品信息显示
#### 点击购物车，罗列用户在购物车表的数据（新建一个VO类来存储返回的信息）
#### 如果用户未登录，购物车信息为空