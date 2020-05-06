    public String[] getAllSon(String id, Map<String, String> map){
        ListIterator<String> condition = new ArrayList<String>(){{add(id);}}.listIterator();//可变查询条件
        Set<String> set=new HashSet<String>(){{add(id);}};//查询结果 set是[3, 6, 9, 10]
        while (condition.hasNext()){
            String paid = condition.next();
            //entryset() 返回map中各个键值对映射关系的集合。 循环判断与值相同，取出对应的key值添加到列表，列表循环取值查询
            for (Map.Entry<String,String> entry : map.entrySet()){
                if (paid.equals(entry.getValue())){//为父id的时候
                    if (set.add(entry.getKey())){
                        condition.add(entry.getKey());
                    //因为add添加是添加到当前指针的上一个位置 要用previous【之前的】 调整指针位置
                    condition.previous();
                    }
                }
            }
        }
        String[] result= set.toArray(new String[0]);//基于数组API与collection的API桥梁。数组是从大到小，set是从小到大
        return result;
    }