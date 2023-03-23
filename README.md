## 项目简介
本课题内容为智慧水产养殖知识图谱的构建。通过收集水产养殖的数据，设计数据模式，构建知识图谱系统，展示三元组，描述水产实体之间的关系，对农业水产养殖现代化提供支持，对养殖户实际生产有很大的帮助。

## 部署方式
1.使用IDEA导入项目  
2.在电脑上安装neo4j  
3.将doc中的`graph_backup.dump`文件放在neo4j的backup文件夹下，然后在neo4j的bin目录下通过cmd运行`neo4j-admin load --from=../backup/graph_backup.dump --database=graph.db --force`，将备份数据导入数据库  
4.配置application.yaml中的neo4j数据库的账号和密码  
5.运行项目，访问`localhost:8080/knowledge-graph/page/home.html`  

## 注意
1.springboot版本为**1.5.12.RELEASE**，如果版本过高会有未知bug


