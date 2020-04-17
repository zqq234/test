    public static String RemoveOne(String userIds, Long userId) {
        // 返回结果
        String result = "";
        // 判断是否存在。如果存在，移除指定用户 ID；如果不存在，则直接返回空
        if(userIds.indexOf(",") != -1) {
            // 拆分成数组
            String[] userIdArray = userIds.split(",");
            // 数组转集合
            List<String> userIdList = new ArrayList<String>(Arrays.asList(userIdArray));
            // 移除指定用户 ID
            userIdList.remove(userId.toString());
            // 把剩下的用户 ID 再拼接起来
            result = StringUtils.join(userIdList, ",");
        }
        // 返回
        return result;
    }