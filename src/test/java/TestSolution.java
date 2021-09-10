import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSolution {

    Solution solution;

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void whenRootIsEmptyThenItShouldReturnEmpty() {
        ListNode listNode = solution.reverseList(null);
        Assert.assertNull(listNode);

        ListNode emptyRoot = new ListNode(1);
        listNode = solution.reverseList(emptyRoot);
        Assert.assertEquals(emptyRoot, listNode);

    }

    @Test
    public void itShouldReverseList() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        one.next = two;
        two.next = three;

        ListNode reverseList = solution.reverseList(one);

        Assert.assertEquals(3, reverseList.val);
        Assert.assertEquals(2, reverseList.next.val);
        Assert.assertEquals(1, reverseList.next.next.val);


    }

}
