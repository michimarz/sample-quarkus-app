package michimarz.toolkit.entity;

import java.util.List;

public class DataRoot
{
	private List<Tool> content;

	public DataRoot()
	{
		super();
	}

	public List<Tool> getContent()
	{
		return this.content;
	}

	public void setContent(final List<Tool> content)
	{
		this.content = content;
	}

	@Override
	public String toString()
	{
		return "Root: " + this.content;
	}
}