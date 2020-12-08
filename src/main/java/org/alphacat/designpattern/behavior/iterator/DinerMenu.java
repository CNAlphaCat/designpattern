package org.alphacat.designpattern.behavior.iterator;


public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "1111111111111", true, 2.99);
        addItem("BLT", "222222222222", false, 2.99);
        addItem("Soup of the day", "2222222222222", false, 3.29);
        addItem("Hotdog", "33333333333333", false, 3.05);
        //继续加入其他项
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry,menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    //返回迭代器接口。客户不需要知道餐厅菜单是如何维护菜单项的，也不需要知道迭代器是如何实现的，客户只需要直接使用这个迭代器遍历菜单项即可。
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
    //菜单的其他方法。。。。
}
